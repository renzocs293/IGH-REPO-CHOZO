/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.log;

import org.apache.log4j.Logger;

/**
 *
 * @author RYZEN
 */
public class Log4jTest {

    //public static void main(String[] args) {
    final Logger logger = Logger.getLogger(Log4jTest.class);

    public void Test(int t) {
        if (t == 0) {
            logger.info("Exitoso");
        }
        else if (t < 0) {
            logger.warn("Warning");
        }
        else {
            logger.fatal("Error");
        }
    }
    //}
}
