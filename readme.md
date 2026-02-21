# AI-Care-Report-BE

AI 기반 상담 데이터 요약 및 리포트 자동화 시스템의 **백엔드 리포지토리**입니다.<br>
기존 프론트엔드 프로젝트를 확장하고 개발 역량 강화를 위해 백엔드 아키텍처를 설계 및 구현하였습니다.

## 기술 스택

* **Language**: Java 17 (OpenJDK 17)
* **Framework**: Spring Boot 4.0.2
* **Build Tool**: Gradle (Groovy)
* **Database**: PostgreSQL (Supabase)
* **Data Access**: Spring JDBC (JDBCTemplate)
  * 향후 개발 고도화 단계에서 Spring Data JPA로 전환 예정

## 실행 방법 및 주의사항

1. **JDK 17**을 설치하고 환경 변수가 정상적으로 설정되어 있는지 확인합니다.
2. 리포지토리를 클론한 후 IntelliJ에서 `build.gradle` 파일을 열어 프로젝트로 로드합니다.
3. **환경 변수 설정 (보안)**
   * `application.properties`에는 `${DB_PASSWORD}` 변수가 사용되고 있습니다.
   * IntelliJ의 `Run/Debug Configurations` → `Environment variables`에서
     `DB_PASSWORD`라는 이름으로 Supabase 비밀번호를 설정해야 서버가 정상적으로 실행됩니다.
4. **네트워크 설정**
   * 공용 네트워크 환경에서 5432 포트가 차단되는 경우가 발생할 수 있어서, Supabase의 **6543 포트(Transaction Pooler)** 를 사용하여 데이터베이스에 연결합니다.

## 디렉토리 구조 (초안)

```text
src/main/java/com/pauly/AI_Care_Report_BE/
├── controller/  # API 경로 정의 (@RestController)
├── service/     # 핵심 로직 (@Service)
├── repository/  # DB 인터페이스 (@Repository)
├── entity/      # DB 테이블 모델 (@Entity)
├── dto/         # 요청/응답 데이터 모델 (RequestDto, ResponseDto)
├── mapper/      # DB 결과(ResultSet)를 객체로 변환하는 RowMapper 관리
```
