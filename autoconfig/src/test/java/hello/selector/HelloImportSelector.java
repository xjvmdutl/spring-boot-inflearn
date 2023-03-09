package hello.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    //해당 부분은 동적으로 변경할 수 있다 -> 코드이기 때문
    return new String[]{"hello.selector.HelloConfig"};
  }
}
