package org.game.connectfour.model;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.game.connectfour.model.grid.Grid;
import org.game.connectfour.model.grid.Pawn;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GridTest {

	@Autowired
	Grid grid;

	@Before
	public void initGrid() {
		Pawn[][] boxes = new Pawn[4][4];
		grid.setBoxes(boxes);
	}
	
	@Test
	public void isFullGrid() {
		assertThat(grid.isFullGrid()).isEqualTo(true);
	}
	
	

}
