// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface PersistCommandOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.PersistCommandOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  java.util.List<alluxio.grpc.PersistFile> 
      getPersistFilesList();
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  alluxio.grpc.PersistFile getPersistFiles(int index);
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  int getPersistFilesCount();
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  java.util.List<? extends alluxio.grpc.PersistFileOrBuilder> 
      getPersistFilesOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  alluxio.grpc.PersistFileOrBuilder getPersistFilesOrBuilder(
      int index);
}
