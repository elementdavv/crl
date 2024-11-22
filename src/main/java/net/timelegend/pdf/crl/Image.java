// Gstate.java
//
// SPDX-FileCopyrightText: 2024 Element Davv <elementdavv@hotmail.com>
//
// SPDX-License-Identifier: BSD-3-Clause

package net.timelegend.pdf.crl;

/*
 * Image base class
 */
public abstract class Image {
    protected byte[] imgData = null;
	protected int width;
	protected int height;
    protected int bits;
    protected String colorSpace;

    public Image(byte[] src) {}

	public abstract IndirectObject appendToDocument(PDFDocument document) throws InvalidImageException;

	public int getWidth() {
        return width;
    }

	public int getHeight() {
        return height;
    }
}
