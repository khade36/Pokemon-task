import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {OnInit} from '@angular/core/';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-pokecard',
  templateUrl: './pokecard.component.html',
  styleUrls: ['./pokecard.component.css']
})
export class PokecardComponent implements OnInit {
constructor(private http:HttpClient){}

pokemon:any=[];
pokemonDetails:any=[];
url:any;
pagination:any=10;
closePop:any=1;
closeWindow:any=0;
showMyContainer: boolean = false;

  ngOnInit(): void {
    this.http.get(`https://pokeapi.co/api/v2/pokemon/?limit=${this.pagination}`,{responseType:'json' as 'text'}).subscribe((result:any)=>{
      this.pokemon=result.results;

      for(let i=0;i<this.pokemon.length;i++){
        this.url=this.pokemon[i].url;
        this.http.get(this.url).subscribe((result)=>{
        this.pokemonDetails.push(result);
        });
      }
    });
    console.log(this.pokemonDetails);
  }

  load(){ 
   this.pagination=this.pagination+5;
   console.log(this.pagination);
   this.pokemonDetails.splice(0, this.pokemonDetails.length);
   this.ngOnInit();
   }
   savePokemon(value:any){
   console.log(value);
   }
  }

