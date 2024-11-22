// InvalidImageException.java
//
// SPDX-FileCopyrightText: 2024 Element Davv <elementdavv@hotmail.com>
//
// SPDX-License-Identifier: BSD-3-Clause

package net.timelegend.pdf.crl;

/*
 * InvalidImageException
 */
public class InvalidImageException extends Exception {
	public InvalidImageException(String errMessage) {
        super(errMessage);
	}

	public InvalidImageException(String errMessage, Throwable err) {
        super(errMessage, err);
	}
}
