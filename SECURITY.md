# Security Policy

## Purpose

Adhook is committed to protecting the confidentiality, integrity, and availability of its software, services, systems, and data. This document explains how security vulnerabilities affecting this repository should be reported and summarizes the security expectations applicable to this project.

## Reporting a Security Vulnerability

Please report suspected security vulnerabilities privately by email to:

**security@adhook.io**

Do not open a public GitHub issue, discussion, or pull request for a suspected vulnerability until Adhook has completed its investigation and confirmed that public disclosure is appropriate.

Please include as much of the following information as possible:

- A clear description of the vulnerability
- The affected repository, component, version, endpoint, or service
- Steps required to reproduce the issue
- Proof of concept code, screenshots, logs, or request and response examples
- The potential impact on confidentiality, integrity, or availability
- Any known prerequisites or required permissions
- Suggested remediation, when available
- Your preferred contact details

Please do not include customer data, credentials, access tokens, personal data, or other confidential information in the report unless strictly necessary. Where evidence contains sensitive information, redact it or ask us for a secure method of transfer.

## What to Expect

Adhook will:

1. Acknowledge the report as soon as reasonably possible.
2. Assess the severity, impact, and affected systems.
3. Investigate, contain, and remediate confirmed vulnerabilities.
4. Keep the reporter informed when appropriate.
5. Coordinate disclosure after remediation when public disclosure is warranted.

Response and remediation times depend on severity, complexity, affected systems, and required third-party involvement.

## Supported Versions

Security fixes are generally applied to the latest actively maintained version of the repository. Older releases, archived branches, forks, experimental code, and unsupported deployments may not receive security updates.

## Repository Security Policy

Contributors and maintainers must follow secure development practices, including:

- Validate and sanitize untrusted input.
- Apply least privilege and secure default configurations.
- Avoid hardcoded credentials, secrets, tokens, private keys, and customer data.
- Protect sensitive data in transit and at rest using approved cryptographic mechanisms.
- Avoid exposing sensitive information through logs, error messages, test data, or examples.
- Review code changes before merging.
- Use approved third-party dependencies and keep them updated with relevant security patches.
- Document, test, review, and approve changes before deployment.
- Report suspected security incidents or weaknesses immediately.

Secrets must never be committed to the repository. If a secret is committed, it must be considered compromised and rotated immediately. Removing it from Git history alone is not sufficient.

## Responsible Testing and Disclosure

When researching or validating a vulnerability, please:

- Use the minimum testing necessary to confirm the issue.
- Avoid accessing, modifying, copying, or deleting data that does not belong to you.
- Avoid disrupting production services, customer environments, or third-party systems.
- Do not perform denial-of-service testing, social engineering, phishing, spam, or physical security testing.
- Do not use automated scanning that creates excessive traffic or operational risk.
- Keep vulnerability details confidential until remediation and coordinated disclosure are complete.

Adhook does not authorize activity that violates applicable law, contractual obligations, or third-party terms of service.

## Scope

This policy applies to vulnerabilities caused by code or configuration maintained by Adhook in this public repository and, where directly relevant, associated Adhook services.

The following are generally outside scope:

- Vulnerabilities exclusively affecting unsupported versions or unmodified third-party software
- Reports without a demonstrable security impact
- Missing security headers or configuration recommendations without an exploitable condition
- Self-XSS or issues requiring unlikely user interaction without meaningful impact
- Rate limiting observations without a demonstrated security consequence
- Social engineering, phishing, physical attacks, and denial-of-service testing
- Findings produced only by automated scanners without validation
- Publicly known vulnerabilities for which a supported fix is already available

## Security Updates

Confirmed vulnerabilities may be addressed through patches, dependency updates, configuration changes, mitigations, or coordinated releases. Security-related changes follow Adhook's controlled change management process and are tested and reviewed before deployment. Emergency security fixes may use an expedited process while remaining documented and subject to review.

## No Bug Bounty Commitment

Unless explicitly agreed in writing before testing, Adhook does not operate a public bug bounty program and does not guarantee financial compensation or other rewards for submitted reports.

## Contact

For security vulnerabilities: **security@adhook.io**

For general support questions that are not security vulnerabilities, use the normal Adhook support channels.
