/*
 * Copyright (c) 1996-2001
 * Logica Mobile Networks Limited
 * All rights reserved.
 *
 * This software is distributed under Logica Open Source License Version 1.0
 * ("Licence Agreement"). You shall use it and distribute only in accordance
 * with the terms of the License Agreement.
 *
 */
package org.smpp.pdu;

import org.smpp.CommandStatus;

/**
 * @author Logica Mobile Networks SMPP Open Source Team
 * @version $Revision: 1.1 $
 */
public class WrongDestFlagException extends PDUException {
    private static final long serialVersionUID = 6266749651012701472L;

    public WrongDestFlagException() {
        setErrorCode(CommandStatus.ESME_RINVPARAM.statusValue);
    }

    public WrongDestFlagException(PDU pdu) {
        super(pdu);
        setErrorCode(CommandStatus.ESME_RINVPARAM.statusValue);
    }

    public WrongDestFlagException(String s) {
        super(s);
        setErrorCode(CommandStatus.ESME_RINVPARAM.statusValue);
    }

    public WrongDestFlagException(PDU pdu, String s) {
        super(pdu, s);
        setErrorCode(CommandStatus.ESME_RINVPARAM.statusValue);
    }
}
