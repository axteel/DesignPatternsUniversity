package org.axteel.lab4;

public abstract class UserFactory {
    abstract User createUser(String type) throws Exception;
}

class UserStore extends UserFactory {
    @Override
    User createUser(String type) throws Exception {
        if (type.equalsIgnoreCase("Pupil")) {
            return PupilBuilder.aPupil().build();
        } else if (type.equalsIgnoreCase("Student")) {
            return StudentBuilder.aStudent().build();
        } else {
            throw new Exception("Error: No such type as \"" + type + "\"");
        }
    }
}
