package a1;

import a2.MissingShippingInfoException;

public class Profile {
	
	private ShippingInfo info;

	public Profile (ShippingInfo info) throws MissingShippingInfoException {
		set(info);
	}

	private void set(ShippingInfo info) throws MissingShippingInfoException {
		if (info == null) {
			throw new MissingShippingInfoException("ShippingInfo object is missing!");
		}
		this.info = info;
	}

	public ShippingInfo getInfo() {
		return info;
	}

}
