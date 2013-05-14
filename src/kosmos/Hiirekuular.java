package kosmos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Hiirekuular implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent ev) {
		int x = ev.getX();
		int y = ev.getY();
		if (x > 560 && x < 585 && y > 10 && y < 40) {
			if (Paint.mutebuttonpath == Paint.SoundONpath) {
				Sound.muted = true;
				Paint.mutebutton = Paint.SoundOFF;
				Paint.mutebuttonpath = Paint.SoundOFFpath;
				System.out.println("Muted");
			} else {
				Sound.muted = false;
				Paint.mutebutton = Paint.SoundON;
				Paint.mutebuttonpath = Paint.SoundONpath;
				System.out.println("Unmuted");
			}
		}
		System.out.println(ev.getPoint());
		System.out.println(ev.getLocationOnScreen());

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
