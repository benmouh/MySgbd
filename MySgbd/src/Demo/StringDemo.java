/*
 * This file is part of Mysgbd.
 *
 * Mysgbd is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Mysgbd is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mysgbd.  If not, see <http://www.gnu.org/licenses/>.
 */

package Demo;
import java.io.*;
import org.sgbd.Mysgbd.*;

public class StringDemo {

  public static void main(String args[]) {
    try {

      MqlParser p = new MqlParser();

      p.initParser(new ByteArrayInputStream(args[0].getBytes()));
      MStatement st = p.readStatement();
      System.out.println(st.toString()); // Display the statement

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

};
