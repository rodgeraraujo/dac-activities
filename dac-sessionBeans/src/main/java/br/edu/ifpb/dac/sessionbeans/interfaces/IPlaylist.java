package br.edu.ifpb.dac.sessionBeans.interfaces;

import br.edu.ifpb.dac.sessionBeans.model.Band;
import br.edu.ifpb.dac.sessionBeans.model.Playlist;

import java.util.List;

public interface IPlaylist {

    boolean savePlaylist (Playlist playlist);
    boolean deletePlaylist(Playlist playlist);
    boolean updatePlaylist (Playlist playlist);
    List<Band> allPlaylists ();

}
