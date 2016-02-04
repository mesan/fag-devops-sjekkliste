package no.mesan.clouddevops.annotation;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charlotte on 04.02.16.
 */
@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(Log)")
    public void log(ProceedingJoinPoint pjp) throws Throwable {

        Object[] params = pjp.getArgs();
        Signature sig = pjp.getSignature();

        StopWatch sw = new StopWatch();
        Object retVal;

        sw.start();
        try {
            retVal = pjp.proceed();
        } catch (Throwable throwable) {
            retVal = throwable.toString();
            throw throwable;
        }
        sw.stop();

        List<String> logData = new ArrayList<String>();
        logData.add("Metode: " + sig.toString());
        logData.add("Tid: " + sw.getTime());
        logData.add("Parametere: " + params.toString());
        logData.add("Resultat: " + ((retVal != null) ? retVal.toString() : "N/A"));

        Class klasseNavn = pjp.getSignature().getDeclaringType();
        Logger logger = LoggerFactory.getLogger(klasseNavn);

        String logStr = StringUtils.join(logData, " ");
        logger.debug(logStr);
    }
}
