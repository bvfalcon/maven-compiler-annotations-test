import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes("TestExample")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class TestExampleProcessor extends AbstractProcessor
{
	
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv)
	{
		for (Element element : roundEnv.getElementsAnnotatedWith(TestExample.class))
		{
			System.out.println("Annotation @TestExample on element " + element + " processed");
		}
		return true;
	}
}