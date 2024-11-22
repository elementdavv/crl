// Gstate.java
//
// SPDX-FileCopyrightText: 2024 Element Davv <elementdavv@hotmail.com>
//
// SPDX-License-Identifier: BSD-3-Clause

package net.timelegend.pdf.crl;

import java.util.HashMap;
import java.util.Map;

/*
 * ExtGState
 */
public class Gstate {
    private static Map<String, Pair<String, IndirectObject>> mGstatesList = new HashMap<>();

    /*
     * opaque: 0.0 invisible
     */
    public static Pair<String, IndirectObject> setOpaque(PDFDocument document, Double opaque) {
        opaque = Math.max(0.0, Math.min(1.0, opaque));
        String opaquestr = String.valueOf(opaque);
        String key = opaquestr + "_" + opaquestr;

        if (mGstatesList.containsKey(key)) {
            return mGstatesList.get(key);
        }

        int id = mGstatesList.size();
        String name = "Gs" + String.valueOf(++id);
        IndirectObject iobj = document.newIndirectObject();
        document.includeIndirectObject(iobj);
        iobj.setDictionaryContent("  /Type /ExtGState\n" + "  /ca " + opaquestr + "\n" + "  /CA " + opaquestr + "\n");
        Pair<String, IndirectObject> pair = Pair.create(name, iobj);
        mGstatesList.put(key, pair);

        return pair;
    }
}
