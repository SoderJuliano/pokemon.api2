package com.juliano.pokemon.api.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class PokemonUnico{
	
	@NotNull
	private String tipo;
	private String apelido;
	private int nivel;
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private Long id_pokemon;
	
	
	private int novo_hp;
	private int novo_atk;
	private int novo_def;
	private int novo_spa;
	private int novo_spd;
	private int novo_spe;
	
	
	public PokemonUnico(Pokemon pkm, String apelido) {
		this.nivel = 1;
		this.apelido = apelido;
		this.tipo = pkm.getTipo();
		this.id_pokemon = pkm.getId();
		this.novo_hp = pkm.getHp()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_atk = pkm.getAtk()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_def = pkm.getDef()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_spa = pkm.getSpa()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_spd = pkm.getSpd()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_spe = pkm.getSpe()+(int)Math.floor(Math.random()*(10-0+1)+0);
		
		System.out.println("pokemon capturado! Apelido -> "+this.apelido);
	}
	public void evoluir(PokemonUnico pkmunico, Pokemon pkm, String novoApelido){
		this.apelido = novoApelido;
		this.tipo = pkm.getTipo();
		
		this.novo_hp = pkm.getHp()+(pkm.getHp()-pkmunico.getNovo_hp());
		this.novo_atk = pkm.getAtk()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_def = pkm.getDef()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_spa = pkm.getSpa()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_spd = pkm.getSpd()+(int)Math.floor(Math.random()*(10-0+1)+0);
		this.novo_spe = pkm.getSpe()+(int)Math.floor(Math.random()*(10-0+1)+0);
		
		System.out.println("pokemon capturado! Apelido -> "+this.apelido);
	
	}
}