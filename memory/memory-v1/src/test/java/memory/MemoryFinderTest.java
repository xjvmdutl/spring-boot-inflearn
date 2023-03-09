package memory;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryFinderTest {


  @Test
  public void get(){
    MemoryFinder memoryFinder = new MemoryFinder();
    Memory memory = memoryFinder.get();
    System.out.println("memory = " + memory);
    assertThat(memory).isNotNull();
  }
}
