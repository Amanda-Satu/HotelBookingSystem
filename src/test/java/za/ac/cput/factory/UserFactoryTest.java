package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    private UserFactory factory;

    @BeforeEach
    void setUp() {
        factory = new UserFactory();
    }

        @Test
        void createUser(){
        User user1 = UserFactory.createUser(12345L, "Fiona", "Gallagher", "fionagallagher@yahoo.com", "fIona123", "0781315716", "Guest" );

        assertNotNull(user1);
        assertEquals("Fiona", user1.getFirstName());
        assertEquals("fionagallagher@yahoo.com", user1.getEmail());
        assertEquals("Guest", user1.getRole());
  }

  @Test
    void CreateUserWithIncorrectRole(){
        assertThrows(IllegalArgumentException.class, () ->
            UserFactory.createUser(12345L, "Fiona", "Gallagher", "fionagallagher@yahoo.com",
                    "fIona123", "0781315716", "Guest" ));

  }
@Test
    void CreateUserWithIncorrectEmail(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                UserFactory.createUser(12345L, "Fiona", "Gallagher", "fionagallagher##yahoo.com",
                        "fIona123", "0781315716", "Guest"));

        assertEquals("Invalid email", exception.getMessage());


}






}//end