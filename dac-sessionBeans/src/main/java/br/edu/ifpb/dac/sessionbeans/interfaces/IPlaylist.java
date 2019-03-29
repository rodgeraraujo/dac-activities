package br.edu.ifpb.dac.sessionbeans.interfaces;

import br.edu.ifpb.dac.sessionbeans.model.Band;
import br.edu.ifpb.dac.sessionbeans.model.Playlist;

import java.util.List;

public interface IPlaylist {

    boolean savePlaylist (Playlist playlist);
    boolean deletePlaylist(Playlist playlist);
    boolean updatePlaylist (Playlist playlist);
    List<Band> allPlaylists ();

}
