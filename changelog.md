# Version 0.3.3

Diff [0.3.2-0.3.3](https://github.com/dcos/metronome/compare/v0.3.2...0e28f5653f2ee8726c8e1f6499063af19e435f39)

## Bugs and Tracking

* [METRONOME-188](https://jira.mesosphere.com/browse/METRONOME-188) Updated to Protocol Buffers v.3.3.0
* [METRONOME-196](https://jira.mesosphere.com/browse/METRONOME-196) ForcePullImage should not be required

# Version 0.3.1

Diff [0.2.4-0.3.1](https://github.com/dcos/metronome/compare/v0.2.4...v0.3.1)

## Features

* Upgraded to a released version of Marathon Lib [v1.3.13](https://github.com/mesosphere/marathon/releases/tag/v1.3.13)
* Updates to dependencies (including an Akka update to fix [schedule time wrap around bug](https://github.com/akka/akka/issues/20424))
* Added `/info` end point for metronome version information

## Bugs and Tracking

* #150 Added `/info` endpoint
* [MARATHON_EE-1717](https://jira.mesosphere.com/browse/MARATHON_EE-1717) 60s min between reschedules
* [MARATHON_EE-1725](https://jira.mesosphere.com/browse/MARATHON_EE-1725)
* [MARATHON_EE-1726](https://jira.mesosphere.com/browse/MARATHON_EE-1726) Upgrade Marathon libraries and dependencies


## Download

https://s3.amazonaws.com/downloads.mesosphere.io/metronome/releases/0.3.1/metronome-0.3.1.tgz
sha: f6fd3d48a889ea19cb13dfd908a82e53c03ffab1

# Version 0.2.4

diff from [0.2.3-0.2.4](https://github.com/dcos/metronome/compare/87976...23fe8ca)

## Fixes

- Upgraded to cron-utils 6.0.4, fixes issues with cron calculations enabling crons such as `0 9 1-7 * 1-5` as mon-fri the first week of the month only.
- Documentation and Job placement examples provided.


# Version 0.2

Prepare Metronome for DC/OS 1.9.

## Overview

### Service integration tests

We now have a suite of integration tests for DC/OS that runs in our CI.


## Fixes
- Fix #96 Change constraints fields names to match schema.
- Fix #102 API Examples update: test.com -> example.com
- Fix #107 Add /v0/scheduled-jobs raml documentation.


# Version 0.1

Genesis
