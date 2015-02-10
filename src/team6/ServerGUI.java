/*
 * Team 6
 * Mason Henrickson
 * Christopher Dolence
 * Scott Lee
 * Benjamin Winks
 */

/*
 *  Copyright (C) <2015>  <Team 6>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package team6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//This class currently takes hardcoded tankobjects, in a 2d array, and displays
//them in a table.  Will adapt to accept GameState objects, or at least a return
//from a GameState.toArray call.
public class ServerGUI extends JPanel {

    public ServerGUI() {
        super(new GridLayout(1, 0));

        String[] columnNames = {"Tank Image", "Name", "IP",
            "x coord", "y coord", "Health","Status"};
  
        Object[][] data = new Object[8][]; //ugg probably not the best, but i'm rusty and havent picked a standard. this will always be populated?
        GameInstance game=new GameInstance();
        
        for (int i=0;i<8;i++){
        	data[i]=game.tanks.get(i).toStringArray();
        }
        

        JTable table = new JTable(data, columnNames);

        table.setPreferredScrollableViewportSize(new Dimension(800, 180));

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        
    }// end ServerTankObjectGUI()
}// end ServerTankObjectGUI Class

