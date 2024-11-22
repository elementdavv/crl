// Pair.java
//
// SPDX-FileCopyrightText: 2024 Element Davv <elementdavv@hotmail.com>
//
// SPDX-License-Identifier: BSD-3-Clause

package net.timelegend.pdf.crl;

import java.util.Objects;

/*
 * Pair class, copied android.util.Pair source
 */
public class Pair<T, P> {
    public T first;
    public P second;

    public Pair(T t, P p) {
        first = t;
        second = p;
    }

    public static<A, B> Pair<A, B> create(A a, B b) {
        return new Pair<A, B>(a, b);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>)o;
        return Objects.equals(p.first, first) && Objects.equals(p.second, second);
    }

    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
    }

    public String toString() {
        return "Pair{" + String.valueOf(first) + " " + String.valueOf(second) + "}";
    }
}
