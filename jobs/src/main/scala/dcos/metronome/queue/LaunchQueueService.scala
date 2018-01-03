package dcos.metronome.queue

import dcos.metronome.model.QueuedJobRunInfo

/**
  * Provides access to the underlying list of tasks in the launch queue.
  *
  */
trait LaunchQueueService {

  def list(): scala.collection.immutable.Seq[QueuedJobRunInfo]

}