package co.ray.abstraction;

public class Smartphonee implements Camera,Musicplayer,Gps {

	@Override
	public void getlocation() {
		// TODO Auto-generated method stub
		System.out.println("users location is this");
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("play this music");
	}

	@Override
	public void stopmusic() {
		// TODO Auto-generated method stub
		System.out.println("stop this music");
	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		System.out.println("take photo");
	}

	@Override
	public void recordvideo() {
		// TODO Auto-generated method stub
		System.out.println("record the video");
	}

}
