package com.researchspace.repository.spi;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * Definitions of commonly used licenses
 */
public class LicenseDefs {

	public static LicenseDef CC_0;
	public static LicenseDef CC_BY;
	public static LicenseDef CC_NC;
	public static LicenseDef CC_NC_ND;
	public static LicenseDef CC_NC_SA;
	public static LicenseDef CC_ND;
	public static LicenseDef CC_SA;
	public static LicenseDef MIT;
	public static LicenseDef GPL;
	public static LicenseDef GPL2;
	public static LicenseDef GPL3;
	public static LicenseDef APACHE_2;

	/**
	 * RSpace-specific URL constant meaning no license should be used.
	 */
	public static final String NO_LICENSE_URL = "https://NO_LICENSE";

	static {
		try {
			CC_0 = new LicenseDef(new URL("https://creativecommons.org/publicdomain/zero/1.0/"), "CC0 1.0");
			CC_BY = new LicenseDef(new URL("https://creativecommons.org/licenses/by/4.0/"), "CC BY 4.0");
			CC_NC = new LicenseDef(new URL("https://creativecommons.org/licenses/by-nc/4.0/"), "CC BY-NC 4.0");
			CC_NC_ND = new LicenseDef(new URL("https://creativecommons.org/licenses/by-nc-nd/4.0/"), "CC BY-NC-ND 4.0");
			CC_NC_SA = new LicenseDef(new URL("https://creativecommons.org/licenses/by-nc-sa/4.0/"), "CC BY-NC-SA 4.0");
			CC_ND = new LicenseDef(new URL("https://creativecommons.org/licenses/by-nd/4.0/"), "CC BY-ND 4.0");
			CC_SA = new LicenseDef(new URL("https://creativecommons.org/licenses/by-sa/4.0/"), "CC BY-SA 4.0");
			MIT = new LicenseDef(new URL("https://opensource.org/licenses/MIT"), "MIT");
			GPL = new LicenseDef(new URL("https://www.gnu.org/copyleft/gpl.html"), "GPL");
			GPL2 = new LicenseDef(new URL("https://www.gnu.org/licenses/gpl-2.0.html"), "GPL-2.0");
			GPL3 = new LicenseDef(new URL("https://www.gnu.org/licenses/gpl-3.0.html"), "GPL-3.0");
			APACHE_2 = new LicenseDef(new URL("https://www.apache.org/licenses/LICENSE-2.0.html"), "Apache-2");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
