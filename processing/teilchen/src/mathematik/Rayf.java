/*
 * Mathematik
 *
 * Copyright (C) 2009 Patrick Kochlik + Dennis Paul
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * {@link http://www.gnu.org/licenses/lgpl.html}
 *
 */


package mathematik;


import java.io.Serializable;


/**
 * @deprecated
 */
public class Rayf<T extends Vectorf>
    implements Serializable, Vectorf {

    private static final long serialVersionUID = -1748179277316146234L;

    public T origin;

    public T direction;

    public Rayf(Class<T> theClass) {
        try {
            origin = theClass.newInstance();
            direction = theClass.newInstance();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        }
    }


    public Rayf(T theOrigin,
                T theDirection) {
        origin = theOrigin;
        direction = theDirection;
    }


    public String toString() {
        return "origin + " + origin + " / " + " direction " + direction;
    }
}