package com.incubyte.pack1;

class Space{
	   private int x;
	   private int y;
	   private  int z;
	   private String direction;
	   private String dUp;
	   private String dDown;
	    public Space(int x, int y, int z, String direction) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	        this.direction = direction;
	    }

	    public String toString() {
	        return "(" + x + ", " + y + ", " + z + ") Final direction=" + direction;
	    }

	    public void moveForward(){
	        if(direction.equals("N")){
	            x++;
	        }
	        else if(direction.equals("S")){
	            x--;
	        }
	        else if(direction.equals("E")){
	            y++;
	        }else if(direction.equals("W")){
	            y--;
	        }else if(direction.equals("Up")){
	            z++;
	            direction=dUp;
	        }else if(direction.equals("Down")){
	        	direction=dDown;
	            z--;
	        }
	    }

	    public void moveBackward(){
	        if(direction.equals("N")){
	            x--;
	        }
	        else if(direction.equals("S")){
	            x++;
	        }
	        else if(direction.equals("E")){
	            y--;
	        }else if(direction.equals("W")){
	            y++;
	        }else if(direction.equals("Up")){
	            z--;
	            direction=dUp;
	        }else if(direction.equals("Down")){
	            z++;
	            direction=dDown;
	        }
	    }

	    public void turnLeft() {
	        if (direction.equals("N")) {
	            direction = "W";
	        } else if (direction.equals("S")) {
	            direction = "E";
	        } else if (direction.equals("E")) {
	            direction = "N";
	        } else if (direction.equals("W")) {
	            direction = "S";
	        }
	    }

	    public void turnRight() {
	        if (direction.equals("N")) {
	            direction = "E";
	        } else if (direction.equals("S")) {
	            direction = "W";
	        } else if (direction.equals("E")) {
	            direction = "S";
	        } else if (direction.equals("W")) {
	            direction = "N";
	        }
	    }

	    public void turnUp() {
	        if (!direction.equals("Up") && !direction.equals("Down")) {
	        	dUp=direction;
	            direction = "Up";
	        }
	    }

	    public void turnDown() {
	        if (!direction.equals("Up") && !direction.equals("Down")) {
	        	dDown=direction;
	            direction = "Down";
	        }
	    }
	    
	}
