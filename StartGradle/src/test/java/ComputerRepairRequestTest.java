import ro.mpp2025.model.ComputerRepairRequest;
import ro.mpp2025.repository.RequestRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void test(){
        ComputerRepairRequest request = new ComputerRepairRequest();
        assertEquals("",request.getOwnerName());
        assertEquals("",request.getOwnerAddress());
    }

    @Test
    @DisplayName("Second Test")
    public void test2(){
        RequestRepository repo = new RequestRepository();

        repo.add(new ComputerRepairRequest(1,"A A","Address A","072222","Asus","13/10/2020","Broken display"));
        repo.add(new ComputerRepairRequest(2,"B B","Address B","072222","Acer","10/10/2020","Faulty keyboard"));
        assertEquals("B B",repo.findById(2).getOwnerName());
        assertEquals("Address A",repo.findById(1).getOwnerAddress());

    }

}