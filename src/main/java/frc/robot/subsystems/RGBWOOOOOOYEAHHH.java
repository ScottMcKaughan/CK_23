/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.Constants.RGBConstants;

public class RGBWOOOOOOYEAHHH extends SubsystemBase {
  // TODO: make more arguments to tailor how the rainbow looks and moves
  m_led = new AddressableLED(// robot map led port here)

  public RGBWOOOOOOYEAHHH() {

  }

    /**
    * rainbow that moves down the LED strand at a constant rate
    * sets the LED buffer to this info but does not change the LEDs
    * do setData after this to update a strand of LEDs
    */
  privte void movingRainbow(int rate) {
    for (var i = 0; i < m_ledBuffer.getLength(); i++) {

      final var hue = (m_rainbowFirstPixelHue + (i * 180 / m_ledBuffer.getLength())) % 180;

      m_ledBuffer.setHSV(i, hue, 255, 128);
    }

    m_rainbowFirstPixelHue += 3;

    m_rainbowFirstPixelHue %= 180;
  }
    
    /**
    * rainbow that changes the whole strand, whole strand is the same color
    * sets the LED buffer to this info but does not change the LEDs
    * do setData after this to update a strand of LEDs
    */
  privte void rainbow() {
    for (var i = 0; i < m_ledBuffer.getLength(); i++) {

      final var hue = (m_rainbowFirstPixelHue + (i * 180 / m_ledBuffer.getLength())) % 180;

      m_ledBuffer.setHSV(i, hue, 255, 128);
    }

    m_rainbowFirstPixelHue += rate;

    m_rainbowFirstPixelHue %= 180;
  }
    
    /**
    * rainbow that moves the rainbow colors along with the robot's speed
    * input the speed from the encoders
    * sets the LED buffer to this info but does not change the LEDs
    * do setData after this to update a strand of LEDs
    */
  privte void rainbowMoveWithRobot(int speed) { 
    // TODO: add a correction value to turn speed into a number for sliding the rainbow
    for (var i = 0; i < m_ledBuffer.getLength(); i++) {

      final var hue = (m_rainbowFirstPixelHue + (i * 180 / m_ledBuffer.getLength())) % 180;

      m_ledBuffer.setHSV(i, hue, 255, 128);
    }

    m_rainbowFirstPixelHue += speed; // good place for correction value

    m_rainbowFirstPixelHue %= 180;
  }
    
        /**
    * rainbow that moves the rainbow colors along with the robot's speed
    * input the speed from the encoders
    * sets the LED buffer to this info but does not change the LEDs
    * do setData after this to update a strand of LEDs
    */
  privte void solidColorToLEDs(int hue, int saturation, int value) { // pass through a color object or three ints? (3 ints for now)
    
    final var hue = // take color and convert it to hue
    
    for (var i = 0; i < m_ledBuffer.getLength(); i++) { 
      m_ledBuffer.setHSV(i, hue, 255, 128);
    }
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    rainbow(// put in speed number here);
      
    m_led.setData(m_ledBuffer);
  }
}
