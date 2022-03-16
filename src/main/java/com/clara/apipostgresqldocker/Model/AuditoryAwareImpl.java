package com.clara.apipostgresqldocker.Model;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditoryAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("CLARA");
    }

}
