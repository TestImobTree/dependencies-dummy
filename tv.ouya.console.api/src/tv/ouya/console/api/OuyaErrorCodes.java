package tv.ouya.console.api;

public abstract interface OuyaErrorCodes
{
    public static final int INVALID_TOKEN = 1000;
    public static final int REQUIRED_PARAMETER_NOT_PROVIDED = 1001;
    public static final int NO_AUTHENTICATION_DATA = 2000;
    public static final int INVALID_AUTHENTICATION_DATA = 2001;
    public static final int INVALID_DEVELOPER_UUID = 2002;
    public static final int INVALID_PRODUCT_ID = 2003;
    public static final int PAYMENT_DECLINED = 2004;
    public static final int INVALID_APP_UUID = 2005;
    public static final int FIELD_VALIDATIONS_FAILED = 2006;
    public static final int INVALID_CONSOLE_ID = 2007;
    public static final int CONSOLE_ALREADY_REGISTERED = 2008;
    public static final int NOT_DEVELOPER = 2009;
    public static final int EMAIL_NOT_CONFIRMED = 2010;
    public static final int INSUFFICIENT_CREDIT = 2011;
    public static final int INVALID_CATEGORY = 2012;
    public static final int CREDIT_CARD_SUBMISSION_FAILED = 2013;
    public static final int NO_PAYMENT_METHOD = 2014;
    public static final int DUPLICATE_PURCHASE = 2015;
    public static final int CREDIT_CARD_NOT_FOUND = 2019;
    public static final int NO_CREDIT_CARD = 2020;
    public static final int CREDIT_CARD_EXPIRED = 2021;
    public static final int CREDIT_CARD_NEEDS_ZIP = 2025;
    public static final int CREDIT_CARD_MISSING_OR_EXPIRED = 2027;
    public static final int VOUCHER_NOT_FOUND = 2028;
    public static final int WALLET_SWITCH = 2030;
    public static final int VOUCHER_MISMATCH = 2032;
    public static final int NO_CACHED_USERDATA = 2501;
    public static final int ERROR_PARSING_RESPONSE_FROM_SERVER = 3002;
    public static final int ERROR_REMOTE_EXCEPTION = 3003;
    public static final int THROW_DURING_ON_SUCCESS = 3004;
    public static final int SERVER_OFFLINE = 3005;
}
