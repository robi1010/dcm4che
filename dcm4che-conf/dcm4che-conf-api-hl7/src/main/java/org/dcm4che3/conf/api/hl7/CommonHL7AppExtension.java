package org.dcm4che3.conf.api.hl7;

import org.dcm4che3.conf.api.extensions.CommonIterator;
import org.dcm4che3.net.hl7.HL7ApplicationExtension;

/**
 * @author Roman K
 */
public class CommonHL7AppExtension extends HL7ApplicationExtension{
    /**
     * Iterates over all configurable fields and transfers the values using getter/setters from 'from' to this
     * @param from The extension with new configuration
     * @param clazz Class of the extension
     */
    public void reconfigureReflectively(HL7ApplicationExtension from, Class<? extends HL7ApplicationExtension> clazz) {
        CommonIterator.reconfigure(this, from, clazz);
    }

    public void reconfigure(HL7ApplicationExtension from) {
        // fallback to default reflective if the extension did not override the method
        reconfigureReflectively(from,from.getClass());
    }
}
