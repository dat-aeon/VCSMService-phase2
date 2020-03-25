package mm.aeon.com.common;

public class CommonConstants {

	public static final int ZERO = 0;
	public static final int MEMBER_TYPE_BROWN_ID = 1;
	public static final String REFRESH_TOKEN = "refresh_token";

	// async-info.
	public static final long ASYNC_SLEEP_TIME = 1000L;// 1min.

	// Gender
	public static final short GENDER_MALE = 1;
	public static final short GENDER_FEMALE = 2;

	// Password length
	public static final int PASSWORD_LENGTH_MIN = 6;
	public static final int PASSWORD_LENGTH_MAX = 16;

	// Password status
	public static final String PASSWORD_STRONG = "PASSWORD_STRONG";
	public static final String PASSWORD_WEAK = "PASSWORD_WEAK";
	public static final String PASSWORD_NORMAL = "PASSWORD_NORMAL";

	// version config.
	public static final String MUST_UPDATE = "MUST_UPDATE";
	public static final String SHOULD_UPDATE = "SHOULD_UPDATE";

	// Flag
	public static final int FLAG_ON = 0;
	public static final int FLAG_OFF = 1;

	// Member Verification
	public static final String VALID = "VALID";
	public static final String NOT_VALID = "NOT_VALID";

	// Coupon Status
	public static final String COUPON_USED_STATUS = "2";

	// OTP URL
	public static final String MAIN_URL = "http://172.16.112.55/aeonsmsgatewayapi/sendsmsto?";
	public static final String PHONE_URL = "phone=";
	public static final String PHONE_95 = "95";
	public static final String USER_NAME_URL = "&username=aeon";
	public static final String PASSWORD_URL = "&password=ae1940on122";
	public static final String UNICODE_URL = "&unicode=true";
	public static final String MESSAGE_URL = "&message=";
	public static final String PROJECT_ID_URL = "&prjId=VCS";

	// Register
	public static final String MEMBER = "MEMBER";
	public static final String NON_MEMBER = "NON_MEMBER";
	public static final Integer MEMBER_TYPE = 1;
	public static final Integer NON_MEMBER_TYPE = 2;
	public static final Integer CUSTOMER_TYPE = 3;

	// Mobile Version OS Type
	public static final Integer OS_TYPE_ANDROID = 1;
	public static final Integer OS_TYPE_IOS = 2;

	// Account Lock Type
	public static final Short LOCK = 1;
	public static final Short UNLOCK = 0;

	public static final String ERROR = "ERROR";
	public static final String STATUS_500 = "500";
	public static final String STATUS_200 = "200";

}
