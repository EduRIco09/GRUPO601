package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	
	
	public class setup extends MovieClip {
		
		private var FONDO_new: FONDO = new FONDO ();
		private var PISO_new: PISO = new PISO();
		static var PROTAGONISTA_new: PROTAGONISTA = new PROTAGONISTA();
		private var ANTAGONISTA_new: ANTAGONISTA = new ANTAGONISTA();
		
		static var puntos: Number=0;
		static var PUNTOS_BOX_new: PUNTOS_BOX = new PUNTOS_BOX();
		
		public function setup() {
			// constructor code
			
			addChild( FONDO_new );
			addChild ( PISO_new );
			addChild (PROTAGONISTA_new);
			addChild (ANTAGONISTA_new);
			addChild (PUNTOS_BOX_new);
			
			PUNTOS_BOX_new.x=550;
			PUNTOS_BOX_new.y=420;
			PUNTOS_BOX_new.PUNTOSTXT.text=String(puntos);
			
			FONDO_new.y = 0;
			FONDO_new.x = 0;
			
			PISO_new.y = 350;
			PISO_new.x = 0;
			
			PROTAGONISTA_new.y = 350;
			PROTAGONISTA_new.x = 280;
			
			ANTAGONISTA_new.y = 50;
			ANTAGONISTA_new.x = 320;
			
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
				
		}
				public function actualiza_puntos(e:Event){
				PUNTOS_BOX_new.PUNTOSTXT.text=String(puntos);
								  
		}
	}
	
}
