/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import baldrbeerpong.Player;
import baldrbeerpong.Tournament;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vincent
 */
public class MyTableModel extends AbstractTableModel {
    private String[] columnNames = {"Positie","Naam","Wins","Losses","Rating","Games played"};
    private Tournament tournament;

    public MyTableModel(Tournament tournament) {
        Collections.sort(tournament.getPlayers(), new RatingComparator());
        this.tournament = tournament;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return tournament.getNumberOfPlayers();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        Player player = tournament.getPlayers().get(row);
        String value = new String();
        switch (col) {
            case 0: value = Integer.toString(tournament.getPosition(player));
                break;
            case 1: value = player.getFullName();
                break;
            case 2: value = Integer.toString(player.getWins());
                break;     
            case 3: value = Integer.toString(player.getLosses());
                break;  
            case 4: value = Integer.toString(player.getRating());
                break;    
            case 5: value = Integer.toString(player.getGames());
                break; 
        }
        return value;
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
