package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		
		private var FONDO_new: FONDO = new FONDO ();
		private var PISO_new: PISO = new PISO();
		private var PROTAGONISTA_new: PROTAGONISTA = new PROTAGONISTA();
		private var ANTAGONISTA_new: ANTAGONISTA = new ANTAGONISTA();
		
		
		public function setup() {
			// constructor code
			
			addChild( FONDO_new );
			addChild ( PISO_new );
			addChild (PROTAGONISTA_new);
			addChild (ANTAGONISTA_new);
			
			FONDO_new.y = 0;S
			FONDO_new.x = 0;
			
			PISO_new.y = 350;
			PISO_new.x = 0;
			
			PROTAGONISTA_new.y = 350;
			PROTAGONISTA_new.x = 280;
			
			ANTAGONISTA_new.y = 50;
			ANTAGONISTA_new.x = 320;
		}
	}
	
}
