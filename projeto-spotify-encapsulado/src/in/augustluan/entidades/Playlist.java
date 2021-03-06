package in.augustluan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private List<Musica> musicas;
	private int qtdMusica; // vc pode descobrir quantas tem chamando qtdMusica na saida no metodo main

	public Playlist() {
		musicas = new ArrayList<Musica>();
		qtdMusica = 0;
	}

	public void add(Musica m) {
		musicas.add(m);
		qtdMusica++;
	}

	public void removerMusicaNome(Musica musica) {
		// TODO - implementar
		Musica msc = null;
		for (Musica m : musicas) {
			if (m.getNome().equals(musica)) {
				msc = m;
			}
		}
		musicas.remove(msc);
		qtdMusica--;
	}

	public static void main(String[] args) {
		Playlist p = new Playlist();
		Musica m = new Musica("asdf", "sdfa", "scvv", Enum.DRAMA, 2020, 45.04, 2);
		Musica m2 = new Musica("asdf", "sdfa", "scvv", Enum.ROMANCE, 2020, 45.04, 2);
		p.add(m);
		p.add(m2);
		System.out.println(p.qtdMusica);
		System.out.println("Excluir 1");
		p.removerMusicaNome(m);
		System.out.println(p.qtdMusica);
		System.out.println("Excluir 2");
		p.removerMusicaNome(m2);
		System.out.println(p.qtdMusica);
	}
}