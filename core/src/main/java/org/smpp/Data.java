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
package org.smpp;

/**
 * This class contains all constant data values used in the SMPP
 * protocol ver 3.4 and in the library as well as some global variable
 * defaults.
 *
 * @author Logica Mobile Networks SMPP Open Source Team
 * @version $Revision: 1.2 $
 */

public class Data {
    public static final int SM_CONNID_LEN = 16;
    public static final int SM_MSG_LEN = 254;
    public static final int SM_SYSID_LEN = 16;
    public static final int SM_MSGID_LEN = 64;
    public static final int SM_PASS_LEN = 9;
    public static final int SM_DATE_LEN = 17;
    public static final int SM_SRVTYPE_LEN = 6;
    public static final int SM_SYSTYPE_LEN = 13;
    public static final int SM_ADDR_LEN = 21;
    public static final int SM_DATA_ADDR_LEN = 65;
    public static final int SM_ADDR_RANGE_LEN = 41;
    public static final int SM_TYPE_LEN = 13;
    public static final int SM_DL_NAME_LEN = 21;
    public static final int SM_PARAM_NAME_LEN = 10;
    public static final int SM_PARAM_VALUE_LEN = 10;
    public static final int SM_MAX_CNT_DEST_ADDR = 254;

    public static final int CONNECTION_CLOSED = 0;
    public static final int CONNECTION_OPENED = 1;

    public static final int SM_ACK = 1;
    public static final int SM_NO_ACK = 0;
    public static final int SM_RESPONSE_ACK = 0;
    public static final int SM_RESPONSE_TNACK = 1;
    public static final int SM_RESPONSE_PNACK = 2;

    //SMPP Command Set
    public static final int GENERIC_NACK = 0x80000000;
    public static final int BIND_RECEIVER = 0x00000001;
    public static final int BIND_RECEIVER_RESP = 0x80000001;
    public static final int BIND_TRANSMITTER = 0x00000002;
    public static final int BIND_TRANSMITTER_RESP = 0x80000002;
    public static final int QUERY_SM = 0x00000003;
    public static final int QUERY_SM_RESP = 0x80000003;
    public static final int SUBMIT_SM = 0x00000004;
    public static final int SUBMIT_SM_RESP = 0x80000004;
    public static final int DELIVER_SM = 0x00000005;
    public static final int DELIVER_SM_RESP = 0x80000005;
    public static final int UNBIND = 0x00000006;
    public static final int UNBIND_RESP = 0x80000006;
    public static final int REPLACE_SM = 0x00000007;
    public static final int REPLACE_SM_RESP = 0x80000007;
    public static final int CANCEL_SM = 0x00000008;
    public static final int CANCEL_SM_RESP = 0x80000008;
    public static final int BIND_TRANSCEIVER = 0x00000009;
    public static final int BIND_TRANSCEIVER_RESP = 0x80000009;
    public static final int OUTBIND = 0x0000000B;
    public static final int ENQUIRE_LINK = 0x00000015;
    public static final int ENQUIRE_LINK_RESP = 0x80000015;
    public static final int SUBMIT_MULTI = 0x00000021;
    public static final int SUBMIT_MULTI_RESP = 0x80000021;
    public static final int ALERT_NOTIFICATION = 0x00000102;
    public static final int DATA_SM = 0x00000103;
    public static final int DATA_SM_RESP = 0x80000103;

    //Interface_Version
    public static final byte SMPP_V33 = (byte) 0x00 - 0x33;
    public static final byte SMPP_V34 = (byte) 0x34;

    //Address_TON
    public static final byte GSM_TON_UNKNOWN = (byte) 0x00;
    public static final byte GSM_TON_INTERNATIONAL = (byte) 0x01;
    public static final byte GSM_TON_NATIONAL = (byte) 0x02;
    public static final byte GSM_TON_NETWORK = (byte) 0x03;
    public static final byte GSM_TON_SUBSCRIBER = (byte) 0x04;
    public static final byte GSM_TON_ALPHANUMERIC = (byte) 0x05;
    public static final byte GSM_TON_ABBREVIATED = (byte) 0x06;
    public static final byte GSM_TON_RESERVED_EXTN = 0x07;

    //Address_NPI
    public static final byte GSM_NPI_UNKNOWN = (byte) 0x00;
    public static final byte GSM_NPI_E164 = (byte) 0x01;
    public static final byte GSM_NPI_ISDN = GSM_NPI_E164;
    public static final byte GSM_NPI_X121 = (byte) 0x03;
    public static final byte GSM_NPI_TELEX = (byte) 0x04;
    public static final byte GSM_NPI_LAND_MOBILE = (byte) 0x06;
    public static final byte GSM_NPI_NATIONAL = (byte) 0x08;
    public static final byte GSM_NPI_PRIVATE = (byte) 0x09;
    public static final byte GSM_NPI_ERMES = (byte) 0x0A;
    public static final byte GSM_NPI_INTERNET = (byte) 0x0E;
    public static final byte GSM_NPI_WAP_CLIENT_ID = (byte) 0x12;
    public static final byte GSM_NPI_RESERVED_EXTN = 0x0F;

    //Service_Type
    public static final String SERVICE_NULL = "";
    public static final String SERVICE_CMT = "CMT";
    public static final String SERVICE_CPT = "CPT";
    public static final String SERVICE_VMN = "VMN";
    public static final String SERVICE_VMA = "VMA";
    public static final String SERVICE_WAP = "WAP";
    public static final String SERVICE_USSD = "USSD";

    public static final byte SMPP_PROTOCOL = (byte) 1;
    public static final byte SMPPP_PROTOCOL = (byte) 2;
    public static final byte SM_SERVICE_MOBILE_TERMINATED = (byte) 0;
    public static final byte SM_SERVICE_MOBILE_ORIGINATED = (byte) 1;
    public static final byte SM_SERVICE_MOBILE_TRANSCEIVER = (byte) 2;

    // State of message at SMSC
    public static final int SM_STATE_EN_ROUTE = 1; // default state for messages in transit
    public static final int SM_STATE_DELIVERED = 2; // message is delivered
    public static final int SM_STATE_EXPIRED = 3; // validity period expired
    public static final int SM_STATE_DELETED = 4; // message has been deleted
    public static final int SM_STATE_UNDELIVERABLE = 5; // undeliverable
    public static final int SM_STATE_ACCEPTED = 6; // message is in accepted state
    public static final int SM_STATE_INVALID = 7; // message is in invalid state
    public static final int SM_STATE_REJECTED = 8; // message is in rejected state

    //******************
    // ESMClass Defines
    //******************

    // Messaging Mode
    public static final int SM_ESM_DEFAULT = 0x00; //Default SMSC Mode or Message Type
    public static final int SM_DATAGRAM_MODE = 0x01; // Use one-shot express mode
    public static final int SM_FORWARD_MODE = 0x02; // Do not use
    public static final int SM_STORE_FORWARD_MODE = 0x03; // Use store & forward

    // Send/Receive TDMA & CDMA Message Type
    public static final int SM_SMSC_DLV_RCPT_TYPE = 0x04; // Recv Msg contains SMSC delivery receipt
    public static final int SM_ESME_DLV_ACK_TYPE = 0x08; // Send/Recv Msg contains ESME delivery acknowledgement
    public static final int SM_ESME_MAN_USER_ACK_TYPE = 0x10; // Send/Recv Msg contains manual/user acknowledgment
    public static final int SM_CONV_ABORT_TYPE = 0x18; // Recv Msg contains conversation abort (Korean CDMA)
    public static final int SM_INTMD_DLV_NOTIFY_TYPE = 0x20; // Recv Msg contains intermediate notification

    // GSM Network features
    public static final int SM_NONE_GSM = 0x00; // No specific features selected
    public static final int SM_UDH_GSM = 0x40; // User Data Header indicator set
    public static final int SM_REPLY_PATH_GSM = 0x80; // Reply path set
    public static final int SM_UDH_REPLY_PATH_GSM = 0xC0; // Both UDH & Reply path

    // Optional Parameter Tags, Min and Max Lengths
    // Following are the 2 byte tag and min/max lengths for
    // supported optional parameter (declann)

    public static final short OPT_PAR_MSG_WAIT = 2;

    // Privacy Indicator
    public static final short OPT_PAR_PRIV_IND = 0x0201;

    // Source Subaddress
    public static final short OPT_PAR_SRC_SUBADDR = 0x0202;
    public static final int OPT_PAR_SRC_SUBADDR_MIN = 2;
    public static final int OPT_PAR_SRC_SUBADDR_MAX = 23;

    // Destination Subaddress
    public static final short OPT_PAR_DEST_SUBADDR = 0x0203;
    public static final int OPT_PAR_DEST_SUBADDR_MIN = 2;
    public static final int OPT_PAR_DEST_SUBADDR_MAX = 23;

    // User Message Reference
    public static final short OPT_PAR_USER_MSG_REF = 0x0204;

    // User Response Code
    public static final short OPT_PAR_USER_RESP_CODE = 0x0205;

    // Language Indicator
    public static final short OPT_PAR_LANG_IND = 0x020D;

    // Source Port
    public static final short OPT_PAR_SRC_PORT = 0x020A;

    // Destination Port
    public static final short OPT_PAR_DST_PORT = 0x020B;

    // Concat Msg Ref Num
    public static final short OPT_PAR_SAR_MSG_REF_NUM = 0x020C;

    // Concat Total Segments
    public static final short OPT_PAR_SAR_TOT_SEG = 0x020E;

    // Concat Segment Seqnums
    public static final short OPT_PAR_SAR_SEG_SNUM = 0x020F;

    // SC Interface Version
    public static final short OPT_PAR_SC_IF_VER = 0x0210;

    // Display Time
    public static final short OPT_PAR_DISPLAY_TIME = 0x1201;

    // Validity Information
    public static final short OPT_PAR_MS_VALIDITY = 0x1204;

    // DPF Result
    public static final short OPT_PAR_DPF_RES = 0x0420;

    // Set DPF
    public static final short OPT_PAR_SET_DPF = 0x0421;

    // MS Availability Status
    public static final short OPT_PAR_MS_AVAIL_STAT = 0x0422;

    // Network Error Code
    public static final short OPT_PAR_NW_ERR_CODE = 0x0423;
    public static final int OPT_PAR_NW_ERR_CODE_MIN = 3;
    public static final int OPT_PAR_NW_ERR_CODE_MAX = 3;

    // Extended Short Message has no size limit

    // Delivery Failure Reason
    public static final short OPT_PAR_DEL_FAIL_RSN = 0x0425;

    // More Messages to Follow
    public static final short OPT_PAR_MORE_MSGS = 0x0426;

    // Message State
    public static final short OPT_PAR_MSG_STATE = 0x0427;

    // Callback Number
    public static final short OPT_PAR_CALLBACK_NUM = 0x0381;
    public static final int OPT_PAR_CALLBACK_NUM_MIN = 4;
    public static final int OPT_PAR_CALLBACK_NUM_MAX = 19;

    // Callback Number Presentation  Indicator
    public static final short OPT_PAR_CALLBACK_NUM_PRES_IND = 0x0302;

    // Callback Number Alphanumeric Tag
    public static final short OPT_PAR_CALLBACK_NUM_ATAG = 0x0303;
    public static final int OPT_PAR_CALLBACK_NUM_ATAG_MIN = 1;
    public static final int OPT_PAR_CALLBACK_NUM_ATAG_MAX = 65;

    // Number of messages in Mailbox
    public static final short OPT_PAR_NUM_MSGS = 0x0304;

    // SMS Received Alert
    public static final short OPT_PAR_SMS_SIGNAL = 0x1203;

    // Message Delivery Alert
    public static final short OPT_PAR_ALERT_ON_MSG_DELIVERY = 0x130C;

    // ITS Reply Type
    public static final short OPT_PAR_ITS_REPLY_TYPE = 0x1380;

    // ITS Session Info
    public static final short OPT_PAR_ITS_SESSION_INFO = 0x1383;

    // USSD Service Op
    public static final short OPT_PAR_USSD_SER_OP = 0x0501;

    // Priority
    public static final int SM_NOPRIORITY = 0;
    public static final int SM_PRIORITY = 1;

    // Registered delivery
    //   SMSC Delivery Receipt (bits 1 & 0)
    public static final byte SM_SMSC_RECEIPT_MASK = 0x03;
    public static final byte SM_SMSC_RECEIPT_NOT_REQUESTED = 0x00;
    public static final byte SM_SMSC_RECEIPT_REQUESTED = 0x01;
    public static final byte SM_SMSC_RECEIPT_ON_FAILURE = 0x02;
    //   SME originated acknowledgement (bits 3 & 2)
    public static final byte SM_SME_ACK_MASK = 0x0c;
    public static final byte SM_SME_ACK_NOT_REQUESTED = 0x00;
    public static final byte SM_SME_ACK_DELIVERY_REQUESTED = 0x04;
    public static final byte SM_SME_ACK_MANUAL_REQUESTED = 0x08;
    public static final byte SM_SME_ACK_BOTH_REQUESTED = 0x0c;
    //   Intermediate notification (bit 5)
    public static final byte SM_NOTIF_MASK = 0x010;
    public static final byte SM_NOTIF_NOT_REQUESTED = 0x000;
    public static final byte SM_NOTIF_REQUESTED = 0x010;

    // Replace if Present flag
    public static final int SM_NOREPLACE = 0;
    public static final int SM_REPLACE = 1;

    // Destination flag
    public static final int SM_DEST_SME_ADDRESS = 1;
    public static final int SM_DEST_DL_NAME = 2;

    // Higher Layer Message Type
    public static final int SM_LAYER_WDP = 0;
    public static final int SM_LAYER_WCMP = 1;

    // Operation Class
    public static final int SM_OPCLASS_DATAGRAM = 0;
    public static final int SM_OPCLASS_TRANSACTION = 3;

    // Originating MSC Address
    public static final short OPT_PAR_ORIG_MSC_ADDR = (short) 0x8081;
    public static final int OPT_PAR_ORIG_MSC_ADDR_MIN = 1;
    public static final int OPT_PAR_ORIG_MSC_ADDR_MAX = 24;

    // Destination MSC Address
    public static final short OPT_PAR_DEST_MSC_ADDR = (short) 0x8082;
    public static final int OPT_PAR_DEST_MSC_ADDR_MIN = 1;
    public static final int OPT_PAR_DEST_MSC_ADDR_MAX = 24;

    // Unused Tag
    public static final int OPT_PAR_UNUSED = 0xffff;

    // Destination Address Subunit
    public static final short OPT_PAR_DST_ADDR_SUBUNIT = 0x0005;

    // Destination Network Type
    public static final short OPT_PAR_DST_NW_TYPE = 0x0006;

    // Destination Bearer Type
    public static final short OPT_PAR_DST_BEAR_TYPE = 0x0007;

    // Destination Telematics ID
    public static final short OPT_PAR_DST_TELE_ID = 0x0008;

    // Source Address Subunit
    public static final short OPT_PAR_SRC_ADDR_SUBUNIT = 0x000D;

    // Source Network Type
    public static final short OPT_PAR_SRC_NW_TYPE = 0x000E;

    // Source Bearer Type
    public static final short OPT_PAR_SRC_BEAR_TYPE = 0x000F;

    // Source Telematics ID
    public static final short OPT_PAR_SRC_TELE_ID = 0x0010;

    // QOS Time to Live
    public static final short OPT_PAR_QOS_TIME_TO_LIVE = 0x0017;
    public static final int OPT_PAR_QOS_TIME_TO_LIVE_MIN = 1;
    public static final int OPT_PAR_QOS_TIME_TO_LIVE_MAX = 4;

    // Payload Type
    public static final short OPT_PAR_PAYLOAD_TYPE = 0x0019;

    // Additional Status Info Text
    public static final short OPT_PAR_ADD_STAT_INFO = 0x001D;
    public static final int OPT_PAR_ADD_STAT_INFO_MIN = 1;
    public static final int OPT_PAR_ADD_STAT_INFO_MAX = 256;

    // Receipted Message ID
    public static final short OPT_PAR_RECP_MSG_ID = 0x001E;
    public static final int OPT_PAR_RECP_MSG_ID_MIN = 1;
    public static final int OPT_PAR_RECP_MSG_ID_MAX = 65;

    // Message Payload
    public static final short OPT_PAR_MSG_PAYLOAD = 0x0424;
    public static final int OPT_PAR_MSG_PAYLOAD_MIN = 1;
    public static final int OPT_PAR_MSG_PAYLOAD_MAX = 1500;

    // list of character encodings
    // see http://java.sun.com/j2se/1.3/docs/guide/intl/encoding.doc.html
    // from rt.jar

    // American Standard Code for Information Interchange
    public static final String ENC_ASCII = "ASCII";
    // Windows Latin-1
    public static final String ENC_CP1252 = "Cp1252";
    // ISO 8859-1, Latin alphabet No. 1
    public static final String ENC_ISO8859_1 = "ISO8859_1";
    // Sixteen-bit Unicode Transformation Format, big-endian byte order
    // with byte-order mark
    public static final String ENC_UTF16_BEM = "UnicodeBig";
    // Sixteen-bit Unicode Transformation Format, big-endian byte order
    public static final String ENC_UTF16_BE = "UnicodeBigUnmarked";
    // Sixteen-bit Unicode Transformation Format, little-endian byte order
    // with byte-order mark
    public static final String ENC_UTF16_LEM = "UnicodeLittle";
    // Sixteen-bit Unicode Transformation Format, little-endian byte order
    public static final String ENC_UTF16_LE = "UnicodeLittleUnmarked";
    // Eight-bit Unicode Transformation Format
    public static final String ENC_UTF8 = "UTF8";
    // Sixteen-bit Unicode Transformation Format, byte order specified by
    // a mandatory initial byte-order mark
    public static final String ENC_UTF16 = "UTF-16";
    // GSM 7-bit unpacked
    // Requires JVM 1.4 or later
    public static final String ENC_GSM7BIT = "X-Gsm7Bit";

    /**
     * @deprecated As of version 1.3 of the library there are defined
     * new encoding constants for base set of encoding supported by Java Runtime.
     * The <code>CHAR_ENC</code> is replaced by <code>ENC_ASCII</code>
     * and redefined in this respect.
     */
    public static final String CHAR_ENC = ENC_ASCII;

    public static final String DFLT_MSGID = "";
    public static final String DFLT_MSG = "";
    public static final String DFLT_SRVTYPE = "";
    public static final String DFLT_SYSID = "";
    public static final String DFLT_PASS = "";
    public static final String DFLT_SYSTYPE = "";
    public static final String DFLT_ADDR_RANGE = "";
    public static final String DFLT_DATE = "";
    public static final String DFLT_ADDR = "";
    public static final byte DFLT_MSG_STATE = 0;
    public static final byte DFLT_ERR = 0;
    public static final String DFLT_SCHEDULE = "";
    public static final String DFLT_VALIDITY = "";
    public static final byte DFLT_REG_DELIVERY =
            SM_SMSC_RECEIPT_NOT_REQUESTED | SM_SME_ACK_NOT_REQUESTED | SM_NOTIF_NOT_REQUESTED;
    public static final byte DFLT_DFLTMSGID = 0;
    public static final byte DFLT_MSG_LEN = 0;
    public static final byte DFLT_ESM_CLASS = 0;
    public static final byte DFLT_DATA_CODING = 0;
    public static final byte DFLT_PROTOCOLID = 0;
    public static final byte DFLT_PRIORITY_FLAG = 0;
    public static final byte DFTL_REPLACE_IFP = 0;
    public static final String DFLT_DL_NAME = "";
    public static final byte DFLT_GSM_TON = GSM_TON_UNKNOWN;
    public static final byte DFLT_GSM_NPI = GSM_NPI_UNKNOWN;
    public static final byte DFLT_DEST_FLAG = 0; // not set
    public static final int MAX_PDU_LEN = 5000;

    public static final int PDU_HEADER_SIZE = 16; // 4 integers
    public static final int TLV_HEADER_SIZE = 4; // 2 shorts: tag & length

    // all times in milliseconds
    public static final long RECEIVER_TIMEOUT = 60000;
    public static final long CONNECTION_RECEIVE_TIMEOUT = 10000;
    public static final long COMMS_TIMEOUT = 60000;
    public static final long QUEUE_TIMEOUT = 10000;
    public static final long ACCEPT_TIMEOUT = 60000;

    public static final long RECEIVE_BLOCKING = -1;

    public static final int MAX_VALUE_PORT = 65535;
    public static final int MIN_VALUE_PORT = 100;
    public static final int MIN_LENGTH_ADDRESS = 7;

    static private byte defaultTon = Data.DFLT_GSM_TON;
    static private byte defaultNpi = Data.DFLT_GSM_NPI;

    static final public synchronized void setDefaultTon(byte dfltTon) {
        defaultTon = dfltTon;
    }

    static final public synchronized void setDefaultNpi(byte dfltNpi) {
        defaultNpi = dfltNpi;
    }

    static final public synchronized byte getDefaultTon() {
        return defaultTon;
    }

    static final public synchronized byte getDefaultNpi() {
        return defaultNpi;
    }

    static final public long getCurrentTime() {
        return System.currentTimeMillis();
        // return Calendar.getInstance().getTime().getTime();
    }

}
/*
 * $Log: not supported by cvs2svn $
 * Revision 1.1  2003/07/23 00:28:39  sverkera
 * Imported
 *
 *
 * Old changelog:
 * 13-07-01 ticp@logica.com default queue timeout QUEUE_TIMEOUT increased
 *                          from 50 msec to 10 sec
 * 21-09-01 ticp@logica.com added constants for registered delivery
 * 28-09-01 ticp@logica.com DEFAULT_IO_BUF_SIZE moved to the TCPIPConnection
 *                          class and renamed to DFLT_IO_BUF_SIZE
 * 10-10-01 ticp@logica.com max address lengths fixed according smpp spec
 * 16-11-01 ticp@logica.com added multibyte encoding support
 */
