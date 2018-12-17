package be.celludriel.universegenerator.generator;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyUtils {

    public void copyDirectoryToOutputDir(String originFolder, String targetFolder) throws URISyntaxException, IOException {
        String source;
        String target;
        Path folderPath = getFolderPath(originFolder);
        List<Path> files = Files.list(folderPath)
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());

        for (Path file : files) {
            String fileName = file.getFileName().toString();
            source = "/" + originFolder + "/" + fileName;
            target = targetFolder + fileName;
            copyToOutputDir(source, target);
        }
    }

    public void copyToOutputDir(String source, String target) throws IOException {
        FileUtils.touch(new File(target));
        InputStream src = getClass().getResourceAsStream(source);
        Files.copy(src, Paths.get(target), StandardCopyOption.REPLACE_EXISTING);
    }

    private Path getFolderPath(String resourceFolder) throws URISyntaxException, IOException {
        URI uri = getClass().getClassLoader().getResource(resourceFolder).toURI();
        if ("jar".equals(uri.getScheme())) {
            FileSystem fileSystem = FileSystems.newFileSystem(uri, Collections.emptyMap(), null);
            return fileSystem.getPath(resourceFolder);
        } else {
            return Paths.get(uri);
        }
    }

}
