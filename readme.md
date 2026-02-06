# AI-Care-Report-BE

AI 기반 상담 데이터 요약 및 리포트 자동화 시스템의 **백엔드 리포지토리**입니다.
기존 프론트엔드 프로젝트를 고도화하고, 풀스택 역량 강화를 위해 직접 **Spring Boot** 백엔드 아키텍처를 설계 및 구현하였습니다.

## 🛠️ 기술 스택

* **Language**: Java 17 (OpenJDK 17)
* **Framework**: Spring Boot 4.0.2 (Milestone)
* **Build Tool**: Gradle - Groovy
* **Database**: PostgreSQL (Supabase)
* **ORM**: Spring Data JPA

## 🚀 실행 방법 및 주의사항

1. **JDK 17** 설치 및 환경 변수 확인을 진행합니다.
2. 리포지토리 클론 후 IntelliJ에서 `build.gradle` 파일을 프로젝트로 오픈합니다.
3. **환경 변수 설정 (보안)**:
* `application.properties`에는 `${DB_PASSWORD}` 변수가 설정되어 있습니다.
* IntelliJ의 `Run/Debug Configurations` -> `Environment variables`에 `DB_PASSWORD`라는 이름으로 실제 Supabase 비밀번호를 입력해야 서버가 구동됩니다.


4. **네트워크 설정**: 공용 네트워크 보안 정책으로 인한 5432 포트 차단을 해결하기 위해 **6543 포트(Transaction Pooler)** 를 사용하여 연결합니다.

## 📂 디렉토리 구조 (초안)

```text
src/main/java/com/pauly/AI_Care_Report_BE/
├── controller/     # REST API 엔드포인트 정의
├── service/        # 비즈니스 로직 처리 및 외부 API 연동
├── repository/     # Spring Data JPA를 이용한 DB 접근 계층
├── entity/         # PostgreSQL 테이블과 매핑되는 도메인 모델
└── dto/            # 프론트엔드와 통신 시 데이터 전송 객체

```
