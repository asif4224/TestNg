package common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

public class RetryListener implements  IAnnotationTransformer {
	
	public void transformer(ITestAnnotation annotation,Class testclass,Constructor testconstructor,Method testmethod) {
		annotation.setRetryAnalyzer(Retrytest.class);
	}

}
