package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job testJob = new Job();
        Job secondTestJob = new Job();
        assertNotEquals(testJob.getId(), secondTestJob.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().toString());
        assertEquals("Desert", testJobForConstructor.getLocation().toString());
        assertEquals("Quality control", testJobForConstructor.getPositionType().toString());
        assertEquals("Persistence", testJobForConstructor.getCoreCompetency().toString());
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
        public void testJobsForEquality(){
            Job testJobForEquality = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            Job testJobForEquality2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertFalse(testJobForEquality.equals(testJobForEquality2));
        }
@Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJobNewLine = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int space = testJobNewLine.toString().length()-1;
        assertEquals(testJobNewLine.toString().charAt(0), '\n');
        assertEquals(testJobNewLine.toString().charAt(space), '\n');
}
@Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJobLabelsAndData = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJobLabelsAndData.toString(), "\n" + "ID: 4" + "\n" + "Name: Product tester" + "\n" + "Employer: ACME" + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n");
}
    @Test
    public void testToStringHandlesEmptyField() {
        Job testJobEmptyFields = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals(testJobEmptyFields.toString(), "\n" + "ID: 3" + "\n" + "Name: Product tester" + "\n" + "Employer: Data not available" + "\n" + "Location: Desert" + "\n" + "Position Type: Data not available" + "\n" + "Core Competency: Persistence" + "\n");
    }


}

