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

import org.smpp.Data;
import org.smpp.util.ByteBuffer;
import org.smpp.util.NotEnoughDataInByteBufferException;
import org.smpp.util.TerminatingZeroNotFoundException;

/**
 * @author Logica Mobile Networks SMPP Open Source Team
 * @version $Revision: 1.1 $
 */
public class UnbindResp extends Response {
    public UnbindResp() {
        super(Data.UNBIND_RESP);
    }

    public void setBody(ByteBuffer buffer)
            throws NotEnoughDataInByteBufferException, TerminatingZeroNotFoundException, PDUException {
    }

    public ByteBuffer getBody() {
        return null;
    }

    public String debugString() {
        String dbgs = "(unbind_resp: ";
        dbgs += super.debugString();
        dbgs += ") ";
        return dbgs;
    }
}
/*
 * $Log: not supported by cvs2svn $
 */
