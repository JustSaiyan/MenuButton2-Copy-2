/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdx.menu.Screens;
import gdx.menu.Screens.*;
import com.badlogic.gdx.Game;
// Grondin typed this
/**
 *
 * @author G
 */
public class GamMoveSprite extends Game{
    @Override
	public void create () {
        this.setScreen(new ScrPlay(this));
	}

	@Override
	public void render () {
        super.render();
	}
    
    
}