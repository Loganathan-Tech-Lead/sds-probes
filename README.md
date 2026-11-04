# 52. Probes

**Category:** Platform  |  **Status:** Scaffold - implement the TODOs

Liveness, readiness, startup probes via Actuator.

## Sequence
```mermaid
sequenceDiagram
    participant Kubelet
    participant Pod
    Kubelet->>Pod: GET /actuator/health/readiness
    Pod->>Kubelet: 503
    Kubelet->>Pod: liveness no response restart
```

## Run
```bash
# no infrastructure needed
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
