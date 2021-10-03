
public class Vector3D {
	public double x,y,z;
	     
	/**
	 * Created Vector 3D constructor 
	 * @param x is the x component of vector
	 * @param y is the y component of vector 
	 * @param z is the z component of vector
	 */
	
	public Vector3D(double x, double y, double z) {
	this.x = x;
	this.y = y;
	this.z = z;
		
	}
	/**
	 * Copied constructor of Vector 3D known as Vector3D v which will be used in doubleDot class 
	 * @param v
	 */
	public Vector3D(Vector3D v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	} 
	public Vector3D() {
		
	}
	/**
	 * 
	 * @return the x component of vector
	 */
	public double getX() {
		return x;
	}
	/*
	*Sets the x component of the vector
	*/
	public void setX(double x) {
		this.x = x;
	}
	/*
	 * @return the y component of vector
	 */
	public double getY() {
		return y;
	}
	/*
	 * Sets the y component of the vector
	 */
	public void setY (double y) {
		this.y = y;
	}
	/*
	 * return the z component of vector
	 */
    public double getZ() {
	    return z;
    }
    /*
     * Set the z component of vector
     */
    public void setZ(double z) {
    	this.z =z;
    }
    /*
     * Returns a string representation of vector [x,y,z], where x,y,z are the components
     */
    public String toString() {
    	return String.format("[%2f,%2f,%2f]",x,y,z);
    }
    /**
     * Return the magnitude of the vector
     * @return the magnitude of the vector
     */
    public double magnitude() {
    	double mag = Math.pow(this.x,2)+ Math.pow(this.y,2)+Math.pow(this.z,2);
    	return(Math.sqrt(mag));
    }
    /**
     * Multiplies this vector by a scalar 
     * @param f is the scalar that is multiplied 
     * @return this vector after multiplied 
     */
    public String multipleByScale(double f) {
    	double a1,a2,a3;
    	a1=this.x*= f;
    	a2=this.y*= f;
    	a3=this.z*= f;
    	return("(" +String.format("%2f",a1)+","+String.format("%2f",a2)+","+String.format("%2f",a3)+")");
    } 
    /**
     * Add a vector to this vector 
     * @param v taken from constructor v 
     * @return the string displaying changes the components of this vector
     */
    
	public String add(Vector3D v){
		        
		double b1,b2,b3;
		b1= this.x += v.x;
		b2 = this.y += v.y;
		b3 = this.z += v.z;
		return ("("+String.format("%2f",b1) + "," + String.format("%2f",b2) + "," + String.format("%2f",b3)+ ")");
	}
	/**
	 * Subtract a vector from this vector
	 * @param v taken from constructor v
	 * @return the string displaying changes the components of this vector
	 */
	public String subtract(Vector3D v) {
		double c1,c2,c3;
		c1 = this.x -= v.x;
		c2 = this.y -= v.y;
		c3 = this.z -= v.z;
		return ("(" +String.format("%2f",c1) + "," + String.format("%2f",c2) + "," + String.format("%2f",c3)+ ")");
	}
	/**
	 * 
	 * @param f taken in from multiple of Scale class 
	 * @return
	 */
	public String negateVector3D(double f) {
		double d1,d2,d3;
		d1 = this.x *= f-1;
		d2 = this.y *= f-1;
		d3 = this.z *= f-1;
		return("(" + String.format("%2f",d1) + "," + String.format("%2f",d2) + "," + String.format("%2f",d3) + ")");
	}/**
	*Computes the dot product of the vector and the given vector
	*Dot Product equation = x1 * x2 + y1 * y2 + z1 * z2
	*@param takes in Vector3D v constructor
	*@return the Dot product of this and other vector 
	*/
	public double doubleDot(Vector3D v) {
		return x * v.x + y * v.y + z *v.z;
	}
	/*
	 * 
	 */
	public boolean equalsTo(Vector3D v , double b) {
		return Math.abs(magnitude() - v.magnitude()) < b;
	}
}
