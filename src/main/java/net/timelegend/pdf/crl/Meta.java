// Meta.java
//
// SPDX-FileCopyrightText: 2024 Element Davv <elementdavv@hotmail.com>
//
// SPDX-License-Identifier: BSD-3-Clause

package net.timelegend.pdf.crl;

/*
 * Metadata enclosed definition class
 */
public class Meta extends EnclosedContent {
	
	public Meta() {
		super();
		setBeginKeyword("(",false,false);
		setEndKeyword(")",false,true);
	}
	
}
