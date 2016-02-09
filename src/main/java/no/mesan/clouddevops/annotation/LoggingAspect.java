package no.mesan.clouddevops.annotation;

import org.apache.commons.lang3.ArrayUtils;
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

import static java.lang.String.format;

/**
 * Created by charlotte on 04.02.16.
 */
@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(Log)")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {

        Object[] params = pjp.getArgs();
        Signature sig = pjp.getSignature();

        StopWatch sw = new StopWatch();
        Object retVal;
        List<String> logData = new ArrayList<String>();

        logData.add("Parametere: " + ArrayUtils.toString(params));

        sw.start();
        try {
            retVal = pjp.proceed();
        } catch (Throwable throwable) {
            retVal = throwable.toString();
            throw throwable;
        }
        sw.stop();

        logData.add(format("Metode: %s", sig.toString()));
        logData.add(format("Tid: %s ms", sw.getTime()));
        String resultat = (retVal != null) ? retVal.toString() : "N/A";
        logData.add(format("Resultat: %s", resultat));

        Class klasseNavn = pjp.getSignature().getDeclaringType();
        Logger logger = LoggerFactory.getLogger(klasseNavn);

        String logStr = StringUtils.join(logData, " ");
        logger.debug(logStr);

        return retVal;
    }
}
