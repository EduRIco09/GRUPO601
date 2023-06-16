package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class BALA extends MovieClip{
		
		private var vel: Number=5;



		public function BALA(pos_x, pos_y) {
			
			x=pos_x;
			y=pos_y+30;
			
			this.addEventListener (Event.ENTER_FRAME, mover);
			
			// constructor code
		}
		
		public function mover(e:Event){
		y+=vel;
		if(y>=350){
			vel=0;
			stage.removeChild(this);
			this.removeEventListener (Event.ENTER_FRAME, mover);
		}
		
		if (this.hitTestObject(setup.PROTAGONISTA_new)){
			vel=0;
			stage.removeChild(this);
			this.removeEventListener (Event.ENTER_FRAME, mover);
			
			setup.puntos+=1;
			trace(setup.puntos);
			}
		}
		
		

	}
	
}
