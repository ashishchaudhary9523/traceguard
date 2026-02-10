package com.tresless.starter;

import com.tresless.ai.DefaultErrorExplainer;
import com.tresless.core.ai.ErrorExplainer;
import com.tresless.core.event.EventBus;

import com.tresless.core.store.InMemorySignalStore;
import com.tresless.core.store.SignalStore;
import com.tresless.starter.ingestion.ExceptionCaptureAspect;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@ConditionalOnProperty(prefix = "tresless", name = "enabled", havingValue = "true", matchIfMissing = true)
@Import(ExceptionCaptureAspect.class)
public class TreslessAutoConfiguration {

    @Bean
    public EventBus treslessEventBus() {
        return new EventBus();
    }

//    @Bean
//    public TreslessLifecycle treslessLifecycle(EventBus eventBus) {
//        return new TreslessLifecycle(eventBus);
//    }
    @Bean
    public TreslessLifecycle treslessLifecycle(SignalStore signalStore) {
        return new TreslessLifecycle(signalStore);
    }

    @Bean
    @ConditionalOnMissingBean
    public SignalStore signalStore(){
        return new InMemorySignalStore();
    }

    @Bean
    @ConditionalOnMissingBean
    public ErrorExplainer errorExplainer(){
        return new DefaultErrorExplainer();
    }
}
