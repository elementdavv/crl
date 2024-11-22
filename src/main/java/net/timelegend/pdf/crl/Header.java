// Header.java
//
// SPDX-FileCopyrightText: 2024 Element Davv <elementdavv@hotmail.com>
//
// SPDX-License-Identifier: BSD-3-Clause

//
//  Android PDF Writer
//  http://coderesearchlabs.com/androidpdfwriter
//
//  by Javier Santo Domingo (j-a-s-d@coderesearchlabs.com)
//

package net.timelegend.pdf.crl;

public class Header extends Base {

	private String mVersion;
	private String mRenderedHeader;
	
	public Header() {
		clear();
	}
	
	public void setVersion(int Major, int Minor) {
		mVersion = Integer.toString(Major) + "." + Integer.toString(Minor);
		render();
	}
	
	public int getPDFStringSize() {
		return mRenderedHeader.length();
	}
	
	private void render() {
        char[] c = {0x0a, 0x25, 0xff, 0xff, 0xff, 0xff, 0x0a};
        String bs = String.valueOf(c);
		mRenderedHeader = "%PDF-" + mVersion + bs;
	}
	
	@Override
	public String toPDFString() {
		return mRenderedHeader;
	}

	@Override
	public void clear() {
		setVersion(1, 4);
	}

}
